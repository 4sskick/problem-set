import data.Node

fun main() {

      //sorted search list
//      listOf(1, 2, 3, 4, 5, 7, 9).sortedListSearch(9).also {
//            if (it)
//                  print("found")
//            else
//                  print("not found")
//      }

      //"linked list"
      val node1 = Node(value = 1)
      val node2 = Node(value = 2)
      val node3 = Node(value = 3)

      //linking next of n1 to n2
      node1.next = node2
      node2.next = node3
      //would be: node1.value -> node2.value -> node3.value

      print(node1)
}

fun List<Int>.sortedListSearch(find: Int): Boolean {
      val middle: Int = this.size / 2

      if (find <= this[middle])
            for (index in 0..middle) {
                  if (this[index] == find) {
                        println("found inside")
                        return true
                  }
            }
      else {
            for (index in middle until this.size) {
                  if (this[index] == find) {
                        println("found inside else")
                        return true
                  }
            }
      }
      return false
}