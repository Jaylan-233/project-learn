package com.jaylan.filter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestFilter03 implements Filter {
	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		out.print("TestFilter03 before 执行Filter之前");
		out.print("<br>");
		//将请求发给下一个Filter或Web资源
//
		chain.doFilter(request, response);
		out.print("TestFilter03 after");
		out.print("<br>");
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}
}
