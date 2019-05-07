package org.helloworldmvc.controller;

import org.helloworldmvc.contract.*;

public class Controller {
private final IView View;
private final IModel Model;

public Controller(final IView View, final IModel Model) {
	this.View = View;
	this.Model = Model;
	}
public void run() {
	this.View.displayMessage(this.Model.getHelloWorld());
}
}
