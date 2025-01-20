package concurrent;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {

	private BlockingQueue<String> blockingQueue;

	public OrderProducer(BlockingQueue<String> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		try {
			blockingQueue.put("Washing Machine");
			blockingQueue.put("Refrigerator");
			blockingQueue.put("Mac Book");
			blockingQueue.put("Pixel");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
