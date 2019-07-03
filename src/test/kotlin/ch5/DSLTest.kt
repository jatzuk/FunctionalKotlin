package ch5

import org.junit.Test

/* 
 * Created with passion and love
 *    for project FunctionalKotlin
 *        by Jatzuk on 03.07.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class DSLTest {
    @Test
    fun dslTest() {
        val commuter = bicycle {
            description("Fast	carbon	commuter")
            bar {
                barType = BarType.FLAT
                material = Material.ALUMINIUM
            }
            frame {
                material = Material.CARBON
                backWheel {
                    material = Material.ALUMINIUM
                    brake = Brake.DISK
                }
            }
            fork {
                material = Material.CARBON
                frontWheel {
                    material = Material.ALUMINIUM
                    brake = Brake.DISK
                }
            }
        }
        println(commuter)
    }
}
