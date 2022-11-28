﻿using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.Domain;

namespace HttpClients.ClientImplementations;

//this is a Http Host Client
public class HostImpl:HostInterface
{

    private readonly HttpClient client;

    public HostImpl(HttpClient client)
    {
        this.client = client;
    }

    public async Task RegisterHostAsync(Host host)
    {
        HttpResponseMessage responseMessage = await client.PostAsJsonAsync("/host", host);
        if (!responseMessage.IsSuccessStatusCode)
        {
            string content = await responseMessage.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }

    public async Task<Host> LoginHostAsync(string email, string password)
    {
        Host existing = await getHostAsync(email);
        
        //password check
        if (existing.Password.Equals(password))
        {
            throw new Exception("Your password does not match");
        }

        return existing;
    }

    public async Task<Host> AddHousingAsync(Housing housing, string email)
    {
        //We create housing in Database
        HttpResponseMessage created = await client.PostAsJsonAsync("/housing", housing);
        string result = await created.Content.ReadAsStringAsync();
        
        if (!created.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        Housing housingCreated = JsonSerializer.Deserialize<Housing>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
            
        
        //I am adding the housing to a host Housing collection
        Host existing = await getHostAsync(email);
        existing.MyHousings.Add(housingCreated);
        
        
        //sending a host with an added housing to a json serializer
        string dtoAsJson = JsonSerializer.Serialize(existing);
        StringContent body = new StringContent(dtoAsJson, Encoding.UTF8, "application/json");

        //requesting an update of a host
        HttpResponseMessage responseMessage = await client.PatchAsync($"/hosts/{email}", body);
        
        string content = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }
        
        Host host = JsonSerializer.Deserialize<Host>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;

        return host;
    }

    public async Task<Host> getHostAsync(string email)
    {
        HttpResponseMessage responseMessage = await client.GetAsync($"/host/{email}");
        string content = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        Host host = JsonSerializer.Deserialize<Host>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        
        return host;
    }


}