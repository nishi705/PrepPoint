import socket
import threading


def connectToServer(msg):
    # create socket
    sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    # connect to server
    host = "127.0.0.1"
    port = 5001
    sock.connect((host, port))

    # send data
    datas = "Hello from client " + msg
    sock.sendall(datas.encode("utf-8"))

    # receive data
    datar = sock.recv(1024)
    print(str(datar))

    # close
    sock.close()


for i in range(1000):
    t = threading.Thread(target=connectToServer, args=(str(i), ))
    t.start()


