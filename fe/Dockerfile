FROM node:22

WORKDIR /app

ARG VITE_GET_MESSAGES_URL
ARG VITE_POST_MESSAGES_URL
ARG VITE_DELETE_MESSAGES_URL

COPY ./package*.json ./

RUN npm install

COPY . .

RUN npm run build

EXPOSE "9090"

CMD [ "npm", "run", "preview", "--", "--port", "9090", "--host", "0.0.0.0" ]