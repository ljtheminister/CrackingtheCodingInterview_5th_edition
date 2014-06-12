class LinkedList:

    class __Node:
        def __init__(self, data=None):
            self.data = data
            self.next = None

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
        self.head = LinkedList.__Node()
        self.length = 0

    def __len__(self):
        return self.length

    def is_empty(self):
        return self.length == 0

    def add_to_front(self, data):
        new_head = LinkedList.__Node(data)
        new_head.set_next(self.head.get_next()) 
        self.head.set_next(new_head)
        self.length += 1

    def pop_front(self):
        if self.length > 0:


        else:
            raise IndexError("popping from an empty LinkedList")





















