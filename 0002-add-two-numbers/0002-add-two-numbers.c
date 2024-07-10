struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    
    struct ListNode* l3 = (struct ListNode*)malloc(sizeof(struct ListNode));
    l3->val = 0;
    l3->next = NULL;
    
    struct ListNode* curr=l3;
    int carry= 0;

    while (l1!=NULL || l2!=NULL || carry != 0) {
        struct ListNode* newNode =(struct ListNode*)malloc(sizeof(struct ListNode));

        int sum=(l1?l1->val:0) + (l2?l2->val:0) + carry;
        newNode->val=sum%10;
        carry=sum/10;

        if (l1)
            l1=l1->next;
        if (l2)
            l2=l2->next;

        newNode->next=NULL;
        curr->next=newNode;
        curr=newNode;
    }
    return l3->next;
}
