package fr.lernejo.todo;

import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;
@Component
public class ApplicationIdentifierFilter implements javax.servlet.Filter {
    protected String instance_id ;
    public ApplicationIdentifierFilter()
    {
        UUID id = UUID.randomUUID();
        this.instance_id= id.toString();
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        response.setHeader("Instance-Id",this.instance_id);
    }
}
