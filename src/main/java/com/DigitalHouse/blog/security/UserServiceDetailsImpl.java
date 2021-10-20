package com.DigitalHouse.blog.security;

import com.DigitalHouse.blog.model.Usuario;
import com.DigitalHouse.blog.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.OptionalLong;

@Service // Indica que trata-se de um serviço
public class UserServiceDetailsImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository userRepository;

    @Override
    public UserDetails loadUserByUsername (String username){
        Optional<Usuario> user = userRepository.findByUsuario(username);
        user.orElseThrow(()-> new UsernameNotFoundException(username + "not found"));

        return user.map(UserDetailsImpl::new).get();
    }




}
