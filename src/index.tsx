import TooltipCustom from './NativeTooltipCustom';

export function multiply(a: number, b: number): number {
  return TooltipCustom.multiply(a, b);
}

export function compare(a: number, b: number): boolean {
  return TooltipCustom.compare(a, b);
}

export function checkCameraPermission(): Promise<boolean> {
  return TooltipCustom.checkCameraPermission();
}