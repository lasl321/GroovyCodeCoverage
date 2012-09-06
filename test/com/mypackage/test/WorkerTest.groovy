package com.mypackage.test

import com.mypackage.Worker

class WorkerTest extends GroovyTestCase {
    void testModuloInt() {
        def worker = new Worker()
        worker.doModuloInt(2)
    }

    void testModuloDef() {
        def worker = new Worker()
        worker.doModuloDef(2)
    }
}