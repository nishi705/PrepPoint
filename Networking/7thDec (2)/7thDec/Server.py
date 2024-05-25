import socket
import threading

def handleConnection(csock, address):
    # receive data
    datar = csock.recv(1024)
    print(str(datar))

    # send data
    datas = str(datar) + " received on server"
    csock.sendall(datas.encode("utf-8"))

    # close
    csock.close()

# create socket
psock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# bind socket to a port
host = "127.0.0.1"
port = 5001
psock.bind((host, port))

# listen
psock.listen()

# accept connection from clients = childsocket
while True:
    csock, address = psock.accept()
    t = threading.Thread(target=handleConnection, args=(csock, address))
    t.start()

psock.close()
