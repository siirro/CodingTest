# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        # 첫번째 방법 : 링크드리스트->스택->새 링크드리스트 생성
        
        # 스택에 링크드리스트 옮기기
        current = head
        stack = []
        while current != None:
            stack.append(current.val)
            current = current.next
            
        # 스택에서 역순으로 하나씩 빼서 새 링크드 생성하기
        new_head = ListNode()
        current = new_head
        
        while stack:
            value = stack.pop()
            current.next = ListNode(value)
            current = current.next
        
        return new_head.next
    
        # 두번째 방법 : 노드의 prev와 next 역전시키기
#         prev = None
#         cur = head
        
#         while cur:
#             temp = cur.next
#             cur.next = prev
#             prev = cur
#             cur = temp
            
#         return prev
        