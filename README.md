# UserSession Singleton

## Overview

The `UserSession` singleton class manages a single user's session information throughout the application. This ensures that only one instance of the user's session exists, providing a centralized and consistent way to manage user session data.

## Justification

1. **Single User Session Management**: Ensures that there is only one user session throughout the application, preventing multiple conflicting sessions.
2. **Consistency**: Provides a consistent way to manage and access user session information across different parts of the application.
3. **Ease of Use**: Offers a simple API for setting, getting, and clearing user session information, making it easy to manage user state.
