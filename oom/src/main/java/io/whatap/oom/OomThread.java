package io.whatap.oom;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class OomThread extends Thread{
    private static Logger log = LoggerFactory.getLogger(OomThread.class);
    private static List<byte[]> memory = new ArrayList<>();
    private OomThread() {
        start();
    }

    private static class OomThreadHolder {
        private static final OomThread INSTANCE = new OomThread();
    }

    public static OomThread getInstance() {
        return OomThreadHolder.INSTANCE;
    }

    //allocation direct memory ByteBuffer.allocateDirect()
    @Override
    public void run() {
        while(true){
            try {
//                log.info("head memory used={}",);
                memory.add(new byte[1024*1024*10]);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
