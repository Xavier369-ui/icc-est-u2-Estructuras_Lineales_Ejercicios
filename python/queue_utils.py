from collections import deque

class QueueUtils:

    def is_palindrome(self, texto):
        cola = deque()

        for c in texto:
            cola.append(c)

        while len(cola) > 1:
            if cola.popleft() != cola.pop():
                return False

        return True