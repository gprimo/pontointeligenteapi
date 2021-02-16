package com.pontointeligente.api.utils;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder ;

public class PasswordUtils {


    private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);

    public PasswordUtils() {
    }

    public static String gerarBCrypt ( String senha ) {
        if ( senha == null ) {
            return senha ;
        }
        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder ();
        return bCryptEncoder . encode ( senha );
    }

    public static boolean senhaValida ( String senha , String senhaEncoded ) {
        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder ();
        return bCryptEncoder.matches(senha,senhaEncoded);
    }
}
