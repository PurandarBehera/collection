package concurrent;

import java.util.concurrent.BlockingQueue;

public class OrderConsumer implements Runnable {

	private BlockingQueue<String> blockingQueue;

	public OrderConsumer(BlockingQueue<String> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		try {
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
