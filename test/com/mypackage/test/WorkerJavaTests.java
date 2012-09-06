package com.mypackage.test;

import com.mypackage.Worker;
import com.mypackage.WorkerJava;
import org.junit.Test;

public class WorkerJavaTests {
    @Test
    public void testModuloDef() {
        WorkerJava worker = new WorkerJava();
        worker.doModuloInt(2);
    }
}
