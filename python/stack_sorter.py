class StackSorter:

    def sort(self, stack):
        aux = []

        while stack:
            temp = stack.pop()

            while aux and aux[-1] > temp:
                stack.append(aux.pop())

            aux.append(temp)

        while aux:
            stack.append(aux.pop())