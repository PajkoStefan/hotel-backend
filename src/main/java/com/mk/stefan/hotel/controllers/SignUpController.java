package com.mk.stefan.hotel.controllers;

import com.mk.stefan.hotel.model.SignUp;
import com.mk.stefan.hotel.services.signup.SignUpService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class SignUpController {

    private final SignUpService signUpService;

    public SignUpController( SignUpService signUpService) {
        this.signUpService = signUpService;
    }

    @GetMapping("/getallsignups")
    public List<SignUp> getAllSignUps() {
        return signUpService.getAllSignUps();
    }

    @GetMapping("/getsignupbyusername/{username}")
    public Optional<SignUp> getSignUpByUsername(@PathVariable String username){
        return signUpService.getSignUpByUsername(username);
    }

    @PostMapping("/createsignup")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public SignUp createNewSignUp(@RequestBody SignUp signUp,
                                  HttpServletResponse response,
                                  UriComponentsBuilder builder){

        SignUp signUp1 = new SignUp(signUp.getFirstName(), signUp.getLastName(),
                signUp.getUsername(), signUp.getPassword(), signUp.getEmail(),
                signUp.getGender(), signUp.getBirthday(), signUp.getSignUpDate());

        response.setHeader("Location", builder.path("/api/createsignup/"+signUp.getId()).
                buildAndExpand(signUp.getId()).toUriString());

        return signUpService.createNewSignUp(signUp1.getFirstName(), signUp1.getLastName(),
                signUp1.getUsername(), signUp1.getPassword(), signUp1.getEmail(),
                signUp1.getGender(), signUp1.getBirthday(), signUp1.getSignUpDate());

    }
}
