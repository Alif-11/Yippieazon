import express from "express";
import cors from "cors";
import dotenv from "dotenv";
import shoppingCartRoutes from './routes/shoppingCartRoutes';

import { createServer } from 'http';

const app = express();
const PORT = process.env.PORT || 3002;
const FRONTEND_URL = process.env.FRONTEND_URL || "http://localhost:5173";

app.use(express.json());

dotenv.config();

app.use(cors({
  origin: FRONTEND_URL, // Allow frontend origin
  credentials: true,               // If you're sending cookies/auth headers
}));

const httpServer = createServer(app);

app.use("/api/shopping-cart", shoppingCartRoutes);

httpServer.listen(PORT, () => {
  console.log(`Running on port ${PORT}.`)
})