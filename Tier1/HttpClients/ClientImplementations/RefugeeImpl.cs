﻿using System.Net.Http.Json;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.Domain;
using Shared.DTOs;

namespace HttpClients.ClientImplementations;

public class RefugeeImpl:RefugeeInterface
{
    private readonly HttpClient client;

    public RefugeeImpl(HttpClient client)
    {
        this.client = client;
    }

    public async Task<RefugeeDTO> RegisterRefugeeAsync(RefugeeRegisterDTO dto)
    {
        HttpResponseMessage responseMessage = await client.PostAsJsonAsync("/api/refugee", dto);
        
        string content = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }
        
        RefugeeDTO refugee = JsonSerializer.Deserialize<RefugeeDTO>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        
        return refugee;
    }

    public async Task<RefugeeDTO> LoginRefugeeAsync(LoginDTO dto)
    {
        HttpResponseMessage responseMessage = await client.PostAsJsonAsync("/api/refugee/login", dto);
        
        string content = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        RefugeeDTO refugee = JsonSerializer.Deserialize<RefugeeDTO>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        
        return refugee;
    }

    public async Task<RefugeeDTO> DeleteAccountAsync(string email)
    {
        HttpResponseMessage responseMessage = await client.DeleteAsync($"/api/refugee/delete/{email}");
        
        string content = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            Console.WriteLine(content);
            throw new Exception(content);
        }

        RefugeeDTO refugee = JsonSerializer.Deserialize<RefugeeDTO>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        
        return refugee;
    }

    public async Task<RefugeeDTO> UpdateInformation(RefugeeUpdateDTO dto)
    {
        HttpResponseMessage responseMessage = await client.PostAsJsonAsync($"/api/refugee/update", dto);
        
        string content = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            Console.WriteLine(content);
            throw new Exception(content);
        }

        RefugeeDTO refugee = JsonSerializer.Deserialize<RefugeeDTO>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        
        return refugee;
    }

    public async Task<RefugeeDTO> GetRefugee(string email)
    {
        HttpResponseMessage responseMessage = await client.GetAsync($"/api/refugee/{email}");
        
        string content = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }
        
        RefugeeDTO refugee = JsonSerializer.Deserialize<RefugeeDTO>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        
        return refugee;    
    }
}