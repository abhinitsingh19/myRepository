package java8;

public class TestLambda {

	public static void main(String[] args) {
//		Thread t = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					System.out.println(i);
//				}
//			}
//		});

		Thread t = new Thread(() -> {

			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}

		});

		t.start();

	}
}
