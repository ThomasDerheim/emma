/*
 * Copyright © 2014 TU Berlin (emma@dima.tu-berlin.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.emmalanguage
package api.alg

// !!! DO NOT MODIFY - SOURCE FILE GENERATED BY `tools/generate_alg_products.py` !!!

//@formatter:off

case class Alg19[A,B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19]
(
  alg1: Alg[A,B1],
  alg2: Alg[A,B2],
  alg3: Alg[A,B3],
  alg4: Alg[A,B4],
  alg5: Alg[A,B5],
  alg6: Alg[A,B6],
  alg7: Alg[A,B7],
  alg8: Alg[A,B8],
  alg9: Alg[A,B9],
  alg10: Alg[A,B10],
  alg11: Alg[A,B11],
  alg12: Alg[A,B12],
  alg13: Alg[A,B13],
  alg14: Alg[A,B14],
  alg15: Alg[A,B15],
  alg16: Alg[A,B16],
  alg17: Alg[A,B17],
  alg18: Alg[A,B18],
  alg19: Alg[A,B19]
) extends Alg[A,(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19)] {
  type B = (B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19)
  val zero: B = (
    alg1.zero,
    alg2.zero,
    alg3.zero,
    alg4.zero,
    alg5.zero,
    alg6.zero,
    alg7.zero,
    alg8.zero,
    alg9.zero,
    alg10.zero,
    alg11.zero,
    alg12.zero,
    alg13.zero,
    alg14.zero,
    alg15.zero,
    alg16.zero,
    alg17.zero,
    alg18.zero,
    alg19.zero
  )
  val init: A => B = (x: A) => (
    alg1.init(x),
    alg2.init(x),
    alg3.init(x),
    alg4.init(x),
    alg5.init(x),
    alg6.init(x),
    alg7.init(x),
    alg8.init(x),
    alg9.init(x),
    alg10.init(x),
    alg11.init(x),
    alg12.init(x),
    alg13.init(x),
    alg14.init(x),
    alg15.init(x),
    alg16.init(x),
    alg17.init(x),
    alg18.init(x),
    alg19.init(x)
  )
  val plus: (B,B) => B = (x: B, y: B) => (
    alg1.plus(x._1, y._1),
    alg2.plus(x._2, y._2),
    alg3.plus(x._3, y._3),
    alg4.plus(x._4, y._4),
    alg5.plus(x._5, y._5),
    alg6.plus(x._6, y._6),
    alg7.plus(x._7, y._7),
    alg8.plus(x._8, y._8),
    alg9.plus(x._9, y._9),
    alg10.plus(x._10, y._10),
    alg11.plus(x._11, y._11),
    alg12.plus(x._12, y._12),
    alg13.plus(x._13, y._13),
    alg14.plus(x._14, y._14),
    alg15.plus(x._15, y._15),
    alg16.plus(x._16, y._16),
    alg17.plus(x._17, y._17),
    alg18.plus(x._18, y._18),
    alg19.plus(x._19, y._19)
  )
}

//@formatter:on
