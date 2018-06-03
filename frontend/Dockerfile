FROM nginx:alpine AS base
EXPOSE 80 443

FROM node:10.3-alpine AS build
WORKDIR /src
RUN npm i -g @angular/cli
COPY package.json package.json
RUN npm install
COPY . .
RUN ng build --prod --build-optimizer

FROM base AS final
COPY --from=build /src/dist/frontend /usr/share/nginx/html
ENTRYPOINT [ "nginx", "-g", "daemon off;" ]