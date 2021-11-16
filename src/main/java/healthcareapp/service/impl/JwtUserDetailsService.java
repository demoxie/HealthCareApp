package healthcareapp.service.impl;

import healthcareapp.dto.MyUserDetails;
import healthcareapp.exceptions.AccountNotEnabledException;
import healthcareapp.model.Person;
import healthcareapp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JwtUserDetailsService implements  UserDetailsService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
          Optional<Person> userModel = personRepository.findPersonByEmail(userEmail);
          Person user = userModel.orElseThrow(() ->
                  new UsernameNotFoundException("No user found with email : " + userEmail));

            if(user.isEnabled()){
                return new MyUserDetails(user);
            }
            throw new AccountNotEnabledException("Account is disabled");
        }
}
