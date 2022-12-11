package via.sep3.group11.tier2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import via.sep3.group11.tier2.logicInterfaces.HostInterface;
import via.sep3.group11.tier2.shared.DTOs.HostDTO;
import via.sep3.group11.tier2.shared.DTOs.HostRegisterDTO;
import via.sep3.group11.tier2.shared.DTOs.LoginDTO;
import via.sep3.group11.tier2.shared.DTOs.RefugeeDTO;
import via.sep3.group11.tier2.shared.domain.Host;
import via.sep3.group11.tier2.shared.exceptions.NotUniqueException;
import via.sep3.group11.tier2.shared.exceptions.ValidationException;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class HostController {
    /**
     *
     *  Host controller
     * @author Group 11
     * @version 28/11/22
     */

    HostInterface hostLogic;

    public HostController(HostInterface hostLogic)
    {
        this.hostLogic = hostLogic;
    }

    @GetMapping("/host/{housingId}")
    public ResponseEntity<HostDTO> getHostByHousingId(@PathVariable ("housingId") long housingId) {
        try {
            System.out.println("GEtting host by hoiuse id");
            HostDTO hostById = hostLogic.getHostByHousingId(housingId);
            return new ResponseEntity<>(hostById, HttpStatus.OK);
        }
         catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @DeleteMapping("/host/delete/{email}")
    public ResponseEntity<HostDTO> deleteAccount(@PathVariable("email") String email) {
        try {
            HostDTO host = hostLogic.deleteAccount(email);
            return new ResponseEntity<>(host, HttpStatus.OK);
        }

        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
    @PatchMapping("/host")
    public ResponseEntity<HostDTO> updateInformation(@RequestBody HostUpdateDTO hostUpdateDTO) {
        try {
            HostDTO host = hostLogic.updateInformation(hostUpdateDTO);
            return new ResponseEntity<>(host, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

     */

}
