package com.mypackage

import org.junit.*

import static junit.framework.Assert.assertEquals

class WorkerTest {
    int actual
    int expected

    @Test
    void testAnotherWork() {
        def worker = new Worker()
        def actual = worker.doOtherWork(true, true, true)
        def expected = 'xy'

        assertEquals(expected, actual)
    }

    @Test
    void testAnotherWork2() {
        def worker = new Worker()
        def actual = worker.doOtherWork(true, false, true)
        def expected = ''

        assertEquals(expected, actual)
    }

//    @Test
//    void testThisWorker() {
//        def worker = new Worker()
//
//        actual = worker.doSomeWork(1)
//        expected = 1
//        assertEquals(expected, actual)
//
//        actual = worker.doSomeWork(2)
//        expected = 2
//        assertEquals(expected, actual)
//
//        actual = worker.doSomeWork(3)
//        expected = 3
//        assertEquals(expected, actual)
//    }
}