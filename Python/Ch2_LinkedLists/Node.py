class Node:
    def __init__(self, data):
        self.next = None
        self.data = data

    def __str__(self):
        return str(self.data)

    def hasNext(self):
        return self.next != None

    def getNext(self):
        return self.next

    def getData(self):
        return self.data

    def setNext(self, nextNode):
        self.next = nextNode

    def setData(self, data):
        self.data = data

    def append_to_tail(self, data):
        end = Node(data)
           
