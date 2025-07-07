import express from 'express';
import { getCartItems } from '../controllers/shoppingCartController';

const router = express.Router();

router.get('/items/:id', getCartItems);

export default router;