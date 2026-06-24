Project: Real-Time Messaging Platform 
-----------------------------------------------------------------------------------
USER STORY:
-----------------------------------------------------------------------------------
User Registration:
As a new user,
I want to register with my email and password,
so that I can create an account and use the messaging system.
-----------------------------------------------------------------------------------
Acceptance Criteria:
User can sign up with unique email
Password is stored securely
Duplicate email registration is not allowed
-----------------------------------------------------------------------------------
User Login

As a registered user,
I want to log in using my credentials,
so that I can access my chats.

Acceptance Criteria:
Valid credentials allow login
Invalid credentials are rejected
System returns authentication token (JWT or session)
-----------------------------------------------------------------------------------
View User Profile

As a user,
I want to view my profile details,
so that I can verify my account information.

Acceptance Criteria:
User can view name, email, profile image
User can update profile info (optional MVP+)
-----------------------------------------------------------------------------------
User Discovery
View User List

As a user,
I want to see a list of other users,
so that I can start a conversation with them.

Acceptance Criteria:
List excludes current user
Shows basic info (name, status optional)
Supports basic search by name/email
-----------------------------------------------------------------------------------
One-to-One Messaging
Start Conversation

As a user,
I want to start a chat with another user,
so that I can exchange messages privately.

Acceptance Criteria:
System creates a conversation if not exists
Same pair of users should reuse existing conversation
-----------------------------------------------------------------------------------
Send Message

As a user,
I want to send a message to another user,
so that I can communicate in real time.

Acceptance Criteria:
Message is delivered to correct conversation
Message contains sender, receiver, timestamp
Empty messages are not allowed
-----------------------------------------------------------------------------------
Conversation Management
US-9: View Chat List

As a user,
I want to see all my active conversations,
so that I can quickly continue chats.

Acceptance Criteria:
Shows all one-to-one conversations
Displays last message preview
Displays last message time
-----------------------------------------------------------------------------------
Identify Active Conversation

As a user,
I want to open a chat and see messages of that conversation,
so that I can focus on one chat at a time.

Acceptance Criteria:
Selecting a user opens correct conversation
Messages load correctly
-----------------------------------------------------------------------------------
Message Timestamp

As a user,
I want to see when a message was sent,
so that I understand message context.

Acceptance Criteria:
Each message has timestamp
Time is shown in readable format
-----------------------------------------------------------------------------------
Live Message Delivery

As a user,
I want messages to appear instantly when sent by others,
so that I don’t need to refresh the page.

Acceptance Criteria:
Message is pushed to receiver immediately
If user is offline, message is stored and delivered later
-----------------------------------------------------------------------------------
Message Read Status (Optional)

As a user,
I want to know if my message was seen,
so that I understand communication status.

Acceptance Criteria:
Message shows SENT / DELIVERED / READ/ DELETE
----------------------------------------------------------------------------------
