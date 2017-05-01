package uk.co.jakeholden.controller;

import javax.servlet.annotation.WebServlet;

import uk.co.jakeholden.base.ControllerBase;

@WebServlet("/HelloWorld1")
public class HelloWorld1 extends ControllerBase 
{
	private static final long serialVersionUID = -1354867275231014972L;

	@Override
	protected String getHelloWorldVersion() 
	{
		return "1";
	}
}
