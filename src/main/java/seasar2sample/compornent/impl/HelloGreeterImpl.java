package seasar2sample.compornent.impl;

import seasar2sample.compornent.HelloGreeter;
import seasar2sample.compornent.Messenger;

public class HelloGreeterImpl implements HelloGreeter{
	private Messenger messenger;

	public Messenger getMessage() {
		return messenger;
	}

	public void setMessengar(Messenger message) {
		this.messenger = message;

	}

	public void greet() {
		System.out.println(messenger.getMessage());
	}

}
