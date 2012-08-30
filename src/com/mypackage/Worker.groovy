package com.mypackage

class Worker {
    String name

//    int doSomeWork(int label) {
//        if (label == 1)
//            return 1
//        else if (label == 2)
//            return 2
//
//        return label
//    }

    int doOtherWork(boolean x, boolean y, boolean z) {
        // 2
        if (x && y && z)
            return 999

        return 000
    }
}