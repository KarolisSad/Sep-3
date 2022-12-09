﻿namespace Shared.DTOs;

public class RespondAgreementDTO
{
    public long AgreementId { get; }
    public bool Accepted { get; }
    public string ErrorMessage { get; }

    public RespondAgreementDTO(long agreementId, bool accepted, string errorMessage)
    {
        AgreementId = agreementId;
        Accepted = accepted;
        ErrorMessage = errorMessage;
    }
}