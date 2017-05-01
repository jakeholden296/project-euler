package uk.co.jakeholden.controller;

import javax.servlet.annotation.WebServlet;

import uk.co.jakeholden.base.ControllerBase;

@WebServlet("/HelloWorld2")
public class HelloWorld2 extends ControllerBase 
{
	private static final long serialVersionUID = -6086639057694437840L;

	@Override
	protected String getHelloWorldVersion() 
	{
		return "2";
	}
}
