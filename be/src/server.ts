import express from "express";
import cors from "cors";
import dotenv from "dotenv";
import shoppingCartRoutes from './routes/shoppingCartRoutes';

import { createServer } from 'http';

const app = express();
const PORT = process.env.PORT || 3002;

app.use(express.json());

const httpServer = createServer(app);

app.use("/api/shopping-cart", shoppingCartRoutes);

httpServer.listen(PORT, () => {
  console.log(`Running on port ${PORT}.`)
})