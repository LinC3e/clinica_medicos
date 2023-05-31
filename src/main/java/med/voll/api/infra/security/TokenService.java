package med.voll.api.infra.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.stereotype.Service;

import java.sql.Struct;

@Service
public class TokenService {
    public String generarToken(){
        try {
            String secret = "12345";  // Aquí debes proporcionar tu clave secreta
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.create()
                    .withIssuer("voll med")
                    .withSubject("matias.adm")
                    .sign(algorithm);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
