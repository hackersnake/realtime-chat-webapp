# 💬 Real-Time Chat Web App

A real-time group chat application built with **Spring Boot**, **WebSockets**, **STOMP**, and a simple frontend using **HTML + JavaScript + Bootstrap**.  
Users can join the chat by entering their name and send messages that broadcast instantly to everyone connected.

---

## 🔧 Features

- 📡 Real-time messaging using STOMP over WebSockets
- 👥 Multiple users can join and chat simultaneously
- 🧠 User-friendly UI with Bootstrap
- 📦 Lightweight and minimal dependencies

---

## 📁 Project Structure

\`\`\`
src
└── main
    ├── java
    │   └── com.chat.app
    │       ├── controller
    │       │   └── ChatController.java
    │       └── model
    │           └── ChatMessage.java
    └── resources
        ├── static
        │   └── (optional)
        └── templates
            └── chat.html
\`\`\`

---

## 🚀 How to Run

### 1️⃣ Prerequisites
- Java 17+
- Maven or Gradle
- Internet connection (for Bootstrap & JS CDN)

### 2️⃣ Clone the Repository

\`\`\`bash
git clone https://github.com/hackersnake/realtime-chat-webapp.git
cd realtime-chat-webapp
\`\`\`

### 3️⃣ Run the Application

\`\`\`bash
# If using Maven
./mvnw spring-boot:run

# If using Gradle
./gradlew bootRun
\`\`\`

### 4️⃣ Open in Browser

Visit:  
\`http://localhost:8080/chat\`

Enter your name and start chatting!

---

## 🧠 Tech Stack

| Layer         | Tech                      |
|---------------|---------------------------|
| Backend       | Spring Boot, WebSocket, STOMP |
| Frontend      | HTML, JavaScript, Bootstrap |
| Messaging     | SockJS + STOMP            |
| Build Tools   | Maven or Gradle           |

---

## 💬 Sample Message Format

\`\`\`json
{
  "sender": "Alice",
  "content": "Hello, everyone!"
}
\`\`\`

---

## 📌 Future Enhancements

- ✅ Add usernames to messages ✅  
- ⏳ Chat rooms / channels  
- ⏳ Message timestamps  
- ⏳ User presence (online/offline indicators)  
- ⏳ Store chat history in DB

---

## 🤝 Contributing

Pull requests are welcome!  
Feel free to fork the repo and submit improvements.

---

## 📄 License

This project is open-source and free to use under the MIT License.

# Initialize Git and push
git init
git add .
git commit -m "Initial commit with working real-time chat app"
git branch -M main
git remote add origin https://github.com/hackersnake/realtime-chat-webapp.git
git push -u origin main --force
