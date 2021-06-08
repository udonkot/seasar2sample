package seasar2sample;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

import seasar2sample.compornent.HelloGreeter;

public class Main {
	private static final String CONFIG_PATH="app.dicon";
	public static void main(String[] args) {
		SingletonS2ContainerFactory.setConfigPath(CONFIG_PATH);

		SingletonS2ContainerFactory.init();
		try {
			new Main().execute();
		} finally {
			SingletonS2ContainerFactory.destroy();
		}
	}

	private void execute() {
		S2Container con = SingletonS2ContainerFactory.getContainer();
		HelloGreeter helloGreeter = (HelloGreeter)con.getComponent(HelloGreeter.class);
		helloGreeter.greet();
	}

}
