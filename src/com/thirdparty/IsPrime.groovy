#!/usr/bin/env groovy

package com.thirdparty
@Grab('org.apache.commons:commons-math3:3.4.1')
import org.apache.commons.math3.primes.Primes
class IsPrime {
    static boolean check(int count) {
        return Primes.isPrime(count)
    }
    static String foo = "bar"
}