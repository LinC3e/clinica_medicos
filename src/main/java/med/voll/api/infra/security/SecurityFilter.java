package med.voll.api.infra.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class SecurityFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("El filtro esta siendo llamado");

        // Obtener el token del header
        var token = request.getHeader("Authorization");//.replace("Bearer", "");
        if(token == null || token == ""){
            throw new RuntimeException("El token envidado no es valido");
        }
        token = token.replace("Bearer", "");
        System.out.println(token);
        filterChain.doFilter(request,response);
    }
}
