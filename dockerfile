FROM python:3.8-slim
WORKDIR /app
COPY index.html /app/index.html
EXPOSE 8080
CMD ["python", "-m", "http.server", "8080"]