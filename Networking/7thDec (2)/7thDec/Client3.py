import socket

# create socket
sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# connect to server
host = "127.0.0.1"
port = 5001
sock.connect((host, port))

# send data
datas = "Hello from client3"
sock.sendall(datas.encode("utf-8"))

# receive data
datar = sock.recv(1024) # maximum bytes
print(str(datar))

# close
sock.close()
