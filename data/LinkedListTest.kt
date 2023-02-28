package data

import org.junit.Assert.*
import org.junit.Test

class LinkedListTest {

      @Test
      fun push() {

            val list = LinkedList<Int>()
            list.push(3)
                  .push(2)
                  .push(1)

            println(list)
      }


      @Test
      fun append(){
            val list = LinkedList<Int>()
            list.append(1)
            list.append(2)
            list.append(3)

            println(list)
      }
}