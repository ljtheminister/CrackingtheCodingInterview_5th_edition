class DoublyLinkedList:

    class __Node:
        def __init__(self, data=None):
            self.data = data
            self.next = None
            self.prev = None

        def __str__(self):
            return str(self.data)

        def has_next(self):
            return self.next != None

        def get_next(self):
            return self.next

        def get_data(self):
            return self.data

        def set_next(self, nextNode):
            self.next = nextNode

        def set_data(self, data):
            self.data = data

        def append_to_tail(self, data):
            end = Node(data)
 
    
    def __init__(self):


