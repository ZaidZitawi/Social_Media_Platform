# Social Media Platform

This is a simple social media platform project that allows users to manage their profiles, create and interact with posts, manage friendships, and more. The system is built with Spring Boot for the backend, React.js for the frontend, and PostgreSQL for the database.

## Features

- **User Management**: Create an account, log in, update profile details, and search for other users.
- **Post Creation**: Users can create, edit, delete posts, and view posts by friends or all users.
- **Comments**: Users can comment on posts, edit or delete comments.
- **Likes**: Users can like/unlike posts and comments.
- **Friendship System**: Users can send, accept, and reject friend requests.
- **Admin Controls**: Admins can manage users, posts, and comments.
- **Real-time Data Handling**: Posts, comments, and likes show the correct timestamp for when they were created.

## Tech Stack

- **Backend**: Spring Boot
  - Spring Web, Spring Security, Spring Data JPA
  - MapStruct, Lombok
  - PostgreSQL
- **Frontend**: React.js
  - React Router, Axios
- **API Documentation**: Swagger UI


## Quick Insight about the database Design

![image](https://github.com/user-attachments/assets/f47e1927-49b6-4d76-9d3d-9dec71627413)

## Swagger UI

After running the backend, access the Swagger UI at:

## Endpoints

### User Controller

- **Update user info**: `PUT /v0/user/{userId}/update`
- **Get user name**: `GET /v0/user/{userId}/name`
- **Get user email**: `GET /v0/user/{userId}/email`
- **Get user suggestions**: `GET /v0/user/suggestions`
- **Find users by IDs**: `GET /v0/user/findByIds`
- **Find user by ID**: `GET /v0/user/findById/{id}`
- **Find user by email**: `GET /v0/user/findByEmail`
- **Search users**: `GET /v0/user/api/search/users`

### Profile Controller

- **Update profile picture**: `PUT /v0/profile/updateProfilePicture/{userId}`
- **Update profile info**: `PUT /v0/profile/updateInfo/{userId}`
- **Update cover picture**: `PUT /v0/profile/updateCoverPicture/{userId}`
- **Get profile by user ID**: `GET /v0/profile/{userId}`
- **Search profiles**: `GET /v0/profile/search`

### Post Controller

- **Update post**: `PUT /v0/post/update/{postId}`
- **Create new post**: `POST /v0/post/AddPost`
- **Get posts by user**: `GET /v0/post/postsByUser/{userId}`
- **Get post by ID**: `GET /v0/post/getPostById/{postId}`
- **Get all posts**: `GET /v0/post/getAll`
- **Get all posts (general)**: `GET /v0/post/getAllPosts`
- **Get friends' posts**: `GET /v0/post/friendsPosts`
- **Delete post**: `DELETE /v0/post/delete/{postId}`

### Media Controller

- **Update media**: `PUT /v0/media/updateMedia/{mediaId}`
- **Upload media**: `POST /v0/media/media`
- **Get media by ID**: `GET /v0/media/getById/{mediaId}`
- **Get all media**: `GET /v0/media/getAllMedia`
- **Delete media**: `DELETE /v0/media/deleteMedia/{mediaId}`

### Friend Request Controller

- **Reject friend request**: `PUT /v0/friend-request/reject/{requestId}`
- **Accept friend request**: `PUT /v0/friend-request/accept/{requestId}`
- **Send friend request**: `POST /v0/friend-request/send`
- **Get sent requests**: `GET /v0/friend-request/sent`
- **Get received requests**: `GET /v0/friend-request/received`
- **Cancel friend request**: `DELETE /v0/friend-request/cancel/{requestId}`

### Comment Controller

- **Get comment by ID**: `GET /v0/comments/{commentId}`
- **Update comment**: `PUT /v0/comments/{commentId}`
- **Delete comment**: `DELETE /v0/comments/{commentId}`
- **Add comment**: `POST /v0/comments/add`
- **Get all comments**: `GET /v0/comments/all`

### Like Controller

- **Like post**: `POST /v0/like/likePosts/{postId}`
- **Like comment**: `POST /v0/like/LikeComment/{commentId}`
- **Check if post is liked**: `GET /v0/like/isLiked/{postId}`
- **Unlike post**: `DELETE /v0/like/unlikePosts/{postId}`
- **Unlike comment**: `DELETE /v0/like/unlikeComment/{commentId}`

### Auth Controller

- **Register user**: `POST /v0/auth/register`
- **Login user**: `POST /v0/auth/login`
- **Get user by ID**: `GET /v0/auth/user/{userId}`

### Friendship Controller

- **Get user's friends**: `GET /v0/friendship/user/{userId}`

## How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/ZaidZitawi/Social_Media_Platform.git


