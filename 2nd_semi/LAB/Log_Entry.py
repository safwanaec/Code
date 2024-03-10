from argparse import Action
import random
import string
from datetime import datetime

def generate_log_entry(log_type, user_logins, user_logouts, filenames, users, servers, tables, actions, errors):
  """Generates a random log entry based on the specified type."""
  if log_type == "user_login":
    return generate_user_login_logout(user_logins)
  elif log_type == "user_logout":
    return generate_user_login_logout(user_logouts, action="logged out")
  elif log_type == "file_operation":
    return generate_file_operation(filenames, users, servers, actions)
  elif log_type == "database_query":
    return generate_database_query(tables, actions)
  elif log_type == "application_error":
    return generate_application_error(errors)
  else:
    raise ValueError(f"Invalid log type: {log_type}")

def generate_user_login_logout(usernames, action="logged in"):
  """Generates a user login or logout log entry."""
  ip = f"{random.randint(192, 192)}.{random.randint(168, 168)}.{random.randint(0, 255)}.{random.randint(0, 255)}"
  timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
  username = random.choice(usernames)
  message = f"{timestamp} [INFO] User '{username}' {action} successfully from IP address {ip}."
  return message

def generate_file_operation(filenames, users, servers, actions):
  """Generates a random file operation log entry."""
  timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
  filename = random.choice(filenames)
  user = random.choice(users)
  server = random.choice(servers)
  message = f"{timestamp} [INFO] File '{filename}' was {action}ed by user '{user}' on server '{server}'"
  return message

def generate_database_query(tables, actions):
  """Generates a random database query log entry."""
  timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
  table = random.choice(tables)
  message = f"{timestamp} [{Action.upper()}] SQL query '{action} * FROM {table}' executed successfully on database 'customers'."
  return message

def generate_application_error(errors):
  """Generates a random application error log entry."""
  timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
  error = random.choice(errors)
  message = f"{timestamp} [ERROR] {error}"
  return message

if __name__ == "__main__":
  # Define your data lists
  user_logins = ["admin", "john", "alice", "guest"]
  user_logouts = user_logins.copy()  # Separate copy for logouts
  filenames = ["index.html", "data.txt", "config.json"]
  users = ["john", "alice", "admin"]
  servers = ["webserver1", "dbserver2"]
  tables = ["users", "products", "orders"]
  actions = ["SELECT", "INSERT", "UPDATE", "DELETE"]
  errors = [
    "Internal server error (500) occurred while processing request for '/api/products'. Details: java.lang.NullPointerException: product not found.",
    "Failed to connect to database 'customers'. Error: Connection refused (Connection refused)",
    "Invalid user credentials provided. Username or password is incorrect."
  ]

  # Set the filename for the log entries
  log_file = "log_entries.txt"

  # Open the file in append mode
  with open(log_file, "a") as f:
    # Generate and write 100 log entries of each type
    for _ in range(100):
      log_type = random.choice(["user_login", "user_logout", "file_operation", "database_query", "application_error"])
      entry = generate_log_entry(log_type, user_logins, user_logouts, filenames, users, servers, tables, actions, errors)
