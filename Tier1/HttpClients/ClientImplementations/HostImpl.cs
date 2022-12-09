﻿using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.Domain;
using Shared.DTOs;

namespace HttpClients.ClientImplementations;

//this is a Http Host Client
public class HostImpl:HostInterface
{

    private readonly HttpClient client;


    public HostImpl(HttpClient client)
    {
        this.client = client;
             string[] jwtStrings = JwtAuthImpl.Jwt.Split("\"");
        string token = jwtStrings[3];
        if (token.Contains("\""))
        {
            token.Remove(token.Length);
        }

        client.DefaultRequestHeaders.Add("Authorization", token);
    }

    /*
    public async Task<HostDTO> RegisterHostAsync(HostRegisterDTO host)
    {
        //Console.WriteLine(JsonSerializer.Deserialize<HostRegisterDTO>(host.));
        HttpResponseMessage responseMessage = await client.PostAsJsonAsync("/api/host", host);
        string content = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        HostDTO result = JsonSerializer.Deserialize<HostDTO>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        
        return result;
    }

    public async Task<HostDTO> LoginHostAsync(LoginDTO dto)
    {
        HttpResponseMessage responseMessage = await client.PostAsJsonAsync("/api/host/login", dto);
        
        string content = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        HostDTO host = JsonSerializer.Deserialize<HostDTO>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        
        return host;
    }
    */

    public async Task<HostDTO> GetHostByHousingIdAsync(long housingId)
    {
        Console.WriteLine("HousingID: " + housingId);
        HttpResponseMessage responseMessage = await client.GetAsync($"/api/host/{housingId}");
        Console.WriteLine(responseMessage);
        
        string content = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }
        
        

        HostDTO host = JsonSerializer.Deserialize<HostDTO>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        
        return host;
    }
    
    public async Task<HostDTO> DeleteAccountAsync(string email)
    {
        HttpResponseMessage responseMessage = await client.DeleteAsync($"/api/host/delete/{email}");
        Console.WriteLine(responseMessage.ToString());
        
        string content = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        HostDTO host = JsonSerializer.Deserialize<HostDTO>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        
        return host;
    }
}