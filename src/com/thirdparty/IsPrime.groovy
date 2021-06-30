#!/usr/bin/env groovy
package com.thirdparty
@Grab('org.apache.commons:commons-math3:3.4.1')
import org.apache.commons.math3.primes.Primes
class IsPrime {
   static void parallelize(int count) {
  if (!Primes.isPrime(count)) {
    error "${count} was not prime"
  }
  // …
}
   static String foo = "bar"
}