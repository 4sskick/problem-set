package data

class LinkedList<T> {
      private var head: Node<T>? = null
      private var tail: Node<T>? = null
      private var size: Int = 0

      fun isEmpty(): Boolean {
            return size == 0
      }

      override fun toString(): String {
            return if (isEmpty()) {
                  "Empty list"
            } else {
                  head.toString()
            }
      }

      fun value(): T {
            return head!!.value
      }

      var currentNode: Node<T>? = tail
      var next: Node<T>? = head?.next

      //push
      //pushing into an empty list, the new node is both the head and tail of the list.
      // Since the list now has a new node, you increment the value of size.
      fun push(value: T): LinkedList<T> {
            head = Node(value = value, next = head)
            if (tail == null)
                  tail = head
            size++

            return this
      }

      //append
      // if the list is empty, you’ll need to update both head and tail to the new node
      //create a new node after the current tail node. tail will never be null
      fun append(value: T) {
            if (isEmpty()) {
                  push(value)
                  return
            }

            tail?.next = Node(value = value)
            tail = tail?.next
            size++
      }


      //insert
}