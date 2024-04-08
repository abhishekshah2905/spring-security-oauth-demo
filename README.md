# Spring Security OAuth Demo

This is a demo application that demonstrates the use of OAuth2 for authentication in a Spring Boot application.

## Getting Started

### Prerequisites
- Java JDK 8 or higher
- Maven
- Facebook and Github developer accounts with OAuth2 credentials

### Installation
1. Clone the repository:
```bash
  git clone https://github.com/abhishekshah2905/spring-security-oauth-demo.git
```
2. Navigate to the project directory:
```bash
  cd spring-security-oauth-demo
```
3. Open the application.yml file and configure the OAuth2 clients for Facebook and Github:
```bash
facebook:
  client:
    clientId: YOUR_FACEBOOK_CLIENT_ID
    clientSecret: YOUR_FACEBOOK_CLIENT_SECRET
    accessTokenUri: https://graph.facebook.com/oauth/access_token
    userAuthorizationUri: https://www.facebook.com/dialog/oauth
    tokenName: oauth_token
    authenticationScheme: query
    clientAuthenticationScheme: form
  resource:
    userInfoUri: https://graph.facebook.com/me

github:
  client:
    clientId: YOUR_GITHUB_CLIENT_ID
    clientSecret: YOUR_GITHUB_CLIENT_SECRET
    accessTokenUri: https://github.com/login/oauth/access_token
    userAuthorizationUri: https://github.com/login/oauth/authorize
    clientAuthenticationScheme: form
  resource:
    userInfoUri: https://api.github.com/user

```

4. Build the project:
```bash
  mvn clean install
```
5. Run the application:
```bash
  mvn spring-boot:run
```
6. Access the application at http://localhost:8087

### Usage
- Once the application is running, navigate to http://localhost:8087 in your web browser.
- Click on "With Facebook" or "With Github" to initiate OAuth2 authentication.
- Follow the authentication process for the selected provider.
- Upon successful authentication, you will be redirected back to the application and logged in.

### Configuration
- The OAuth2 client configurations for Facebook and Github are defined in the application.yml file.
- You can customize the OAuth2 client settings, such as client ID, client secret, and user authorization URI, to integrate with other OAuth2 providers.